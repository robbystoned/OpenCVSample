package nl.robert.opencv;

import java.awt.Dimension;
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

import net.sourceforge.tess4j.TesseractException;        
       

public class WebCamLicencePlate {

    public static void main (String args[]) throws TesseractException, Exception{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
      WebCamLicencePlate camApp = new WebCamLicencePlate();
       camApp.runApp();
    }
    
    
    
    
    public void runApp() throws TesseractException, Exception {
    	 VideoCapture camera = new VideoCapture(0);

         Mat frame = new Mat();
         camera.read(frame); 

         JFrame jframe = new JFrame("Webcam face detection");
         jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         JPanel panel = new JPanel();
         JLabel label = new JLabel();
         panel.setPreferredSize(new Dimension(800, 800));
         JLabel vidpanel = new JLabel();
         JLabel plates = new JLabel();
         panel.add(vidpanel);
         panel.add(label);
         panel.add(plates);
         jframe.setContentPane(panel);
         jframe.setLocationByPlatform(true);
         jframe.pack();
         jframe.setVisible(true);

        
         DetectLicencePlate demo = new DetectLicencePlate();
         while (true) {
             if (camera.read(frame)) {             	
                 LicencePlate licencePlate = demo.run(frame);
				ImageIcon image = new ImageIcon(MatToBufferedImage(licencePlate.getImage()));
                if(licencePlate.isDutchLicencePlate()) {
                	label.setText(licencePlate.getNormalizedLicencePlate());
                	label.repaint();
                }
                 vidpanel.setIcon(image);
                 vidpanel.repaint();
                 
                 for(Mat croppedImage: licencePlate.getCroppedImage()) {
                	 ImageIcon icon = new ImageIcon(MatToBufferedImage(croppedImage));
                	 plates.setIcon(icon);
                 }

             }
         }
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
