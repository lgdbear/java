public class TestMax {
    /** 主方法 */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = foll(i,j);
        System.out.println("The maximum between " + i +
                " and " + j + " is " + k);
    }

    /** 返回两个整数变量较大的值 */
    public static int foll (int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }


}
