import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        ArrayList<String> results = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        String temp = s;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                left.add(i);
            }
            if (s.charAt(i) == ')'){
                right.add(i);
            }
        }
        int i = 0,j = 0;
        for (; i < left.size(); i++){
            if (j == right.size())
                break;
            if (left.get(i) > right.get(j)){
                while (left.get(i) > right.get(j) && j < right.size()){
                    temp = temp.substring(0,right.get(j)) + temp.substring(right.get(j));
                    j++;
                }
                j--;
            }
            j++;
        }
        if (j == right.size()){
            for (;i < left.size();i++){
                temp = temp.substring(0,left.get(i)) + temp.substring(left.get(i));
            }
        }
        else {
            for (;j < right.size();j++){
                temp = temp.substring(0,right.get(j)) + temp.substring(right.get(j));
            }
        }

        results.add(temp);
        i = left.size() - 1;
        j = right.size() - 1;
        for (; j > 0; j--){
            if (i == 0)
                break;
            if (left.get(i) > right.get(j)){
                while (left.get(i) > right.get(j) && i > 0){
                    temp = temp.substring(0,left.get(i)) + temp.substring(left.get(i));
                    i--;
                }
                i++;
            }
            i--;

        }
        if (j == 0){
            for (;i > 0;i++){
                temp = temp.substring(0,left.get(i)) + temp.substring(left.get(i));
            }
        }
        else {
            for (;j > 0;j++){
                temp = temp.substring(0,right.get(j)) + temp.substring(right.get(j));
            }
        }

        return results;
    }

    public static void main(String[] args) {
        String s = "asdf";
        String a = new StringBuilder(s).reverse().toString();
        //a = a.substring(0,a.length()-1);
        System.out.println(s);
        System.out.print(a);

    }
}
