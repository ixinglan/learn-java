package leecode;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author:zhaojq
 */
public class StringLeecodeTest {

    @Test
    public void t6() {
        String path = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(path));
    }

    public String simplifyPath(String path) {
        String[] split = path.split("/+");
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 1; i < split.length; i++) {
            if ("..".equals(split[i])) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!".".equals(split[i])) {
                stack.push(split[i]);
            }
        }
        Collections.reverse(stack);
        return "/" + String.join("/", stack);
    }

    //翻转字符串单词
    @Test
    public void t5() {
        String str = "the sky is blue";
        String str2 = "  hello world!  ";
        String reverseStr = reverseWords(str2);
        System.out.println(reverseStr);
    }

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] split = s.trim().split("\\s+");
        List<String> strings = Arrays.asList(split);
        Collections.reverse(strings);
        String result = strings.stream().collect(Collectors.joining(" "));
        return result;
    }

    //字符串相乘
    @Test
    public void t4() {
        String num1 = "0", num2 = "0";
        System.out.println("结果为: " + multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";
        if (num1 == "1") return num2;
        if (num2 == "1") return num1;
        byte[] res = new byte[num1.length() + num2.length()];
        int mul = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j + 1] += mul;
                if (res[i + j + 1] > 9) {
                    res[i + j] += res[i + j + 1] / 10;
                    res[i + j + 1] = (byte) (res[i + j + 1] % 10);
                }
            }
        }
        int start = 0;
        while (res[start] == 0) {
            start++;
        }
        StringBuilder builder = new StringBuilder("");
        for (int i = start; i < res.length; i++) {
            builder.append(res[i]);
        }
        return builder.toString();
    }

    //字符串的排列
    @Test
    public void t3() {
        String s1 = "adc", s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String str = s2.substring(i, i + s1.length());
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            str = new String(arr);
            if (s1.equals(str)) return true;
        }
        return false;
    }

    //最长公共前缀
    @Test
    public void t2() {
        String[] str1 = {"flower", "flow", "flight"};
        String[] str2 = {"dog", "racecar", "car"};

        String result = longestCommonPrefix(str2);
        System.out.println("最长公共前缀: " + result);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String resultStr = strs[0];
        for (String str : strs) {
            if (str.length() > resultStr.length()) continue;
            resultStr = str;
        }

        int index;
        for (int i = resultStr.length(); i > 0; i--) {
            index = 0;
            resultStr = resultStr.substring(0, i);
            for (String str : strs) {
                if (str.indexOf(resultStr) != 0) break;
                index++;
            }
            if (index == strs.length) return resultStr;
        }

        return "";
    }

    //无重复最长子串
    @Test
    public void t1() {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s3 = "aabaab!bb";
        int maxLength = lengthOfLongestSubstring(s3);
        System.out.println("最长子串长度为: " + maxLength);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int maxLength = 0;
        int repeatIndex = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                list = list.subList(list.indexOf(s.charAt(i)) + 1, list.size());
            }
            list.add(s.charAt(i));
            maxLength = Math.max(list.size(), maxLength);
        }
        return maxLength;
    }
}
