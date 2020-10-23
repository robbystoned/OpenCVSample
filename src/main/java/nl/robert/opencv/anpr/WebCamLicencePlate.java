package nl.robert.opencv.anpr;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

import net.sourceforge.tess4j.TesseractException;        
       

public class WebCamLicencePlate {
	//UI elements
	private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    private JLabel vidpanel = new JLabel();
    private JLabel plates = new JLabel();
    private JFrame jframe = new JFrame("ANPR Camera");
    Button b = new Button("Pauze");
    boolean continueLoop = true;

    
 
   
    public static void main (String args[]) throws TesseractException, Exception{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
      WebCamLicencePlate camApp = new WebCamLicencePlate();
       camApp.runApp();
    }
    
   
	public void runApp() throws TesseractException, Exception {
		//setup UI
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setPreferredSize(new Dimension(800, 800));

		panel.add(vidpanel);
		panel.add(label);
		panel.add(plates);

		
		b.setBounds(50, 100, 60, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(continueLoop) {
						continueLoop = false;
						b.setLabel("continue");
					} else {
						continueLoop = true;
						b.setLabel("pauze");
					}
					
					System.out.println("blaaaap");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(b);
		jframe.setContentPane(panel);
		jframe.setLocationByPlatform(true);
		jframe.pack();
		jframe.setVisible(true);
		
		
		//Start process
		processWebcam();
	}
	
	private void processWebcam() throws TesseractException, Exception {
	    //webcam video stream 
	    VideoCapture camera = new VideoCapture(0);
	    boolean wset = camera.set(Videoio.CAP_PROP_FRAME_WIDTH, 1280);
	    boolean hset = camera.set(Videoio.CAP_PROP_FRAME_HEIGHT, 720);
	    Mat frame = new Mat();
	    //image processor
	    DetectLicencePlate demo = new DetectLicencePlate();
	    
	    
         while (true) {
             if(continueLoop) {
	        	 if (camera.read(frame)) {             	
	                LicencePlate licencePlate = demo.run(frame);
					ImageIcon image = new ImageIcon(MatToBufferedImage(licencePlate.getImage()));
	                
					if (licencePlate.isDutchLicencePlate()) {
						label.setText(licencePlate.getNormalizedLicencePlate() + " " + licencePlate.getCarDetail());
						label.repaint();
						continueLoop = false;
						b.setLabel("continue");
					}
					vidpanel.setIcon(image);
					vidpanel.revalidate();
					vidpanel.repaint();
					
					for (Mat croppedImage : licencePlate.getCroppedImage()) {
						ImageIcon icon = new ImageIcon(MatToBufferedImage(croppedImage));
						plates.setIcon(icon);
						
					}
					frame.release();
					Thread.sleep(500);
					 
	             }
	         } else {
	        	 Thread.sleep(1000);
	         }
         }
        // camera.release();
	}

    private BufferedImage MatToBufferedImage(Mat frame) {
        //Mat() to BufferedImage
        int type = 0;
        if (frame.channels() == 1) {
            type = BufferedImage.TYPE_BYTE_GRAY;
        } else if (frame.channels() == 3) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        BufferedImage image = new BufferedImage(frame.width(), frame.height(), type);
        WritableRaster raster = image.getRaster();
        DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
        byte[] data = dataBuffer.getData();
        frame.get(0, 0, data);

        return image;
    }

}
