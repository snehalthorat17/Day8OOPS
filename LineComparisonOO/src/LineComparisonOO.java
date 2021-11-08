public class LineComparisonOO {

    public static double calculateLength(Line l1, Line l2)
    {
        double line1subtractx1x2 = l2.getX() - l1.getX();
//                System.out.println("subtract" + line1subtractx1x2);
        double line1squarex1x2 = line1subtractx1x2 * line1subtractx1x2;
//                System.out.println("square" + line1squarex1x2);
        double line1subtracty1y2 = l2.getY() - l1.getY();
        double line1squarey1y2 = line1subtracty1y2 * line1subtracty1y2;
        double lengthOfLine = Math.sqrt(line1squarey1y2 + line1squarey1y2);
        System.out.println("The length of line is "+ lengthOfLine);
        return lengthOfLine;
    }

    public static  void main(String args[])
    {
        Line line1 = new Line(40,50);
        Line line2 = new Line(60,70);
        Line line3 = new Line(70,80);
        Line line4 = new Line(80,90);

        String lineLength1 = String.valueOf(LineComparisonOO.calculateLength(line1,line2));
        String lineLength2 = String.valueOf(LineComparisonOO.calculateLength(line3,line4));

        int compareLineLength=lineLength1.compareTo(lineLength2);
//        System.out.println("compareLineLength: " +compareLineLength);
        if(compareLineLength < 0)
        {
            System.out.println("Line1 is greater than line2");
        }else if(compareLineLength == 0)
        {
            System.out.println("Both lines are equal");
        }else
        {
            System.out.println("Line2 is greater than line1");
        }
    }


}

