package chapter12.ExceptionHandling;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1,2,3,4,5,6,7}));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (StackTraceElement traceElement : traceElements) {
                System.out.print("method " + traceElement.getMethodName());
                System.out.print("(" + traceElement.getClassName() + ":");
                System.out.println(traceElement.getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++)      //the loop should have being < list.length not <= list.length
            result += list[i];
        return result;
    }
}
