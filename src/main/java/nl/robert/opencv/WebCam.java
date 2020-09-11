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
       

public class WebCam {

    public static void main (String args[]) throws InterruptedException{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
       WebCam camApp = new WebCam();
       camApp.runApp();
    }
    
    
    
    
    public void runApp() {
    	 VideoCapture camera = new VideoCapture(0);

         Mat frame = new Mat();
         camera.read(frame); 

         JFrame jframe = new JFrame("Webcam face detection");
         jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         JPanel panel = new JPanel();
         panel.setPreferredSize(new Dimension(800, 800));
         JLabel vidpanel = new JLabel();
         panel.add(vidpanel);
         jframe.setContentPane(panel);
         jframe.setLocationByPlatform(true);
         jframe.pack();
         jframe.setVisible(true);

         DetectFaceDemo demo = new DetectFaceDemo();
         
         while (true) {
             if (camera.read(frame)) {             	
                 ImageIcon image = new ImageIcon(MatToBufferedImage(demo.run(frame)));
                 vidpanel.setIcon(image);
                 vidpanel.repaint();

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
