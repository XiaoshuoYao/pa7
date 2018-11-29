import java.awt.Color;
import java.util.Arrays;

class Collage {
  public static void main(String[] args) {
    Image canvas1 = ImageLibRef.canvasProvided(1920, 1920, new Color(255, 255, 255));
    Image imageExample = CSE8ALib.readImage("image-files/crane.jpg");
    int height = imageExample.getHeight();
    int width = imageExample.getWidth();
    Image imageExampleR = ImageLibRef.chromascale(imageExample, new Color(255,0,0));
    Image imageExampleG = ImageLibRef.chromascale(imageExample, new Color(0,255,0));
    Image imageExampleB = ImageLibRef.chromascale(imageExample, new Color(0,0,255));
    Image Collage1 = ImageLibRef.overlayProvided(imageExample,canvas1,0,0);
    Image Collage2 = ImageLibRef.overlayProvided(collage1,imageExampleR,width,0);
    Image Collage3 = ImageLibRef.overlayProvided(Collage2,imageExampleG,0,height);
    Image Collage4 = ImageLibRef.overlayProvided(Collage3,imageExampleB,width,height);
    System.out.println("canvas1: " + canvas1.toString());
    CSE8ALib.explore(Collage4);
  }
}
