/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{

    public static void testFixUnderwater(){
	Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    public static void testGreyscale(){
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.greyscale();
        beach.explore();
    }

    public static void testNegate(){
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.negate();
	beach.explore();
    }

  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

    public static void testMirrorRighttoLeft()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorRighttoLeft();
	caterpillar.explore();
    }

    public static void testMirrorHorizontal()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
    }
  
    public static void testMirrorBottoTop()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorBottoTop();
        caterpillar.explore();
    }

    public static void testMirrorDiagonal() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorDiagonal();
        caterpillar.explore();
    }	

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

    public static void testMirrorArms() {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    public static void testMirrorGull() {
        Picture gull = new Picture("seagull.jpg");
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }

    public static void testCopy() {
        Picture canvas = new Picture("640x480.jpg");
	Picture gull = new Picture("seagull.jpg");
	canvas.explore();
	canvas.copy(gull, 201, 5, 254, 235);
	canvas.explore();
    }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //----testZeroBlue();
    //----testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //----testNegate();
    //----testGreyscale();
    //----testFixUnderwater();
    //----testMirrorVertical();
    //----testMirrorRighttoLeft();
    //----testMirrorHorizontal();
    //----testMirrorBottoTop();
    //----testMirrorDiagonal();
    //----testMirrorTemple();
    //----testMirrorArms();
    //----testMirrorGull();
    //----testCollage();
    //----testMyCollage();
    //----testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
