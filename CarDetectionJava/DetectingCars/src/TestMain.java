  
public class TestMain {  
  public static void main(String[] args) {  
    System.out.println("Hello, OpenCV");  
    // Load the native library.  
    System.loadLibrary("opencv_java249");  
    new DetectCars().run(); 
    System.out.println("Bye, OpenCV");
  }  
}  