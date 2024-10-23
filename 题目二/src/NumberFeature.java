//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  // 读取输入数字

        String numStr = String.valueOf(num);  // 将数字转为字符串，方便逐位处理
        int length = numStr.length();
        int[] binary = new int[length - 1];  // 用来存储二进制结果

        // 逐位进行奇偶性比较
        for (int i = 0; i < length - 1; i++) {
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));

            // 判断当前位和下一位的奇偶性是否相同
            if ((currentDigit % 2 == nextDigit % 2)) {
                binary[i] = 1;  // 奇偶性相同，记1
            } else {
                binary[i] = 0;  // 奇偶性不同，记0
            }
        }

        // 将二进制数组转换为二进制字符串
        StringBuilder binaryStr = new StringBuilder();
        for (int bit : binary) {
            binaryStr.append(bit);
        }

        // 将二进制字符串转换为十进制数
        int result = Integer.parseInt(binaryStr.toString(), 2);
        System.out.println(result);  // 输出结果
    }
}
