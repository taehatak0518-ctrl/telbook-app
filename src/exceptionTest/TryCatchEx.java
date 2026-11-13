package exceptionTest;

public class TryCatchEx {
    static void main(String[] args) {
        // ArithmaticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없어요");
            System.out.println("오류메세지:" + e.getMessage());

        } catch (Exception e) {
            System.out.println("오류메세지:" + e.getMessage());

        } finally {
            System.out.println("여긴 무조건 실행되요");

        }
        try {

            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

}
}