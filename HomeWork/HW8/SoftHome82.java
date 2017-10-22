public class SoftHome82 {
    public static void main(String[] args) {
        String myLine="I'm  learning  Java  Core";
        while(myLine.contains("  ")) {
            String replace = myLine.replace("  ", " ");
            myLine=replace;
        }
        System.out.println(myLine);
    }
}
