import java.util.ArrayList;
import java.util.List;

public class Question25 {

    public static String[] split(String input, char delimiter) {
        // 使用ArrayList来动态存储分割后的子字符串
        List<String> result = new ArrayList<>();

        // 用于追踪当前子字符串的起始和结束索引
        int startIndex = 0;
        int endIndex;

        // 遍历输入字符串
        for (endIndex = 0; endIndex < input.length(); endIndex++) {
            if (input.charAt(endIndex) == delimiter) {
                // 当找到分隔符时，将当前子字符串添加到结果列表
                result.add(input.substring(startIndex, endIndex));

                // 更新起始索引为下一个子字符串的开始位置
                startIndex = endIndex + 1;
            }
        }

        // 处理最后一个子字符串（如果有的话）
        if (startIndex <= endIndex) {
            result.add(input.substring(startIndex, endIndex));
        }

        // 将结果列表转换为字符串数组
        String[] resultArray = new String[result.size()];
        resultArray = result.toArray(resultArray);

        return resultArray;
    }

    public static void main(String[] args) {
        String input = "ab#12#453";
        char delimiter = '#';

        String[] result = split(input, delimiter);

        // 输出分割后的结果
        for (String s : result) {
            System.out.println(s);
        }
    }
}
