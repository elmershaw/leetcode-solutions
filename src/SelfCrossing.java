public class SelfCrossing {
    class Solution {
        public boolean isSelfCrossing(int[] x) {
            int px = 0,py = 0;
            int count = 0;
            if(x.length < 4)
                return false;
            int a = x[count], b = x[count + 1], c = x[count + 2], d = x[count + 3];
            int boundary1 = 0, boundary2 = 0;

            if( c <= a && d >= b)
                return true;
            else if(c > a && d >= b){
                count +=4;
                return typetwo(x, count);
            }
            else{
                count += 4;
                return typeone(x, count);
            }
        }

        public boolean typeone(int[] x, int count){
            //int count = round * 4;
            while(x.length > count){
                if(x[count] >= x[count - 2])
                    return true;
                count++;
            }
            if(x.length == count)
                return false;
            return typeone(x,count);
        }

        public boolean typetwo(int[] x, int count){
            if(x.length == count)
                return false;
            if(x[count] <= x[count - 2] && x[count] > (x[count - 2] - x[count - 4])){
                count++;
                if(x.length > count){
                    if(x[count] >= (x[count - 2] - x[count - 4]))
                        return true;
                    else
                        return typeone(x, count + 1);
                }
                else
                    return false;
            }
            else if(x[count] == (x[count - 2] - x[count - 4]))
                return true;
            else if(x[count] < (x[count - 2] - x[count - 4]))
                return typeone(x, count + 1);
            else{
                count++;
                if(x.length > count){
                    if(x[count] < x[count - 2]){
                        count++;
                        if(x.length > count){
                            if(x[count] >= (x[count - 2] - x[count - 4])){
                                return true;
                            }
                            else
                                return typeone(x, count + 1);
                        }
                        else
                            return false;
                    }
                    else{
                        count++;
                        if(x.length > count){
                            if(x[count] < (x[count - 2] - x[count - 4])){
                                return typeone(x, count + 1);
                            }
                            else if(x[count] > (x[count - 2] - x[count - 4]) && x[count] < x[count - 2]){
                                count++;
                                if(x.length > count){
                                    if(x[count] > (x[count - 2] - x[count - 4]))
                                        return false;
                                    else
                                        return typeone(x, count + 1);
                                }
                                else
                                    return false;
                            }
                            else{
                                count++;
                                if(x.length > count){
                                    if(x[count] > x[count - 2])
                                        return typetwo(x, count + 1);
                                    else if(x[count] > (x[count - 2] - x[count - 4])){
                                        count++;
                                        if(x.length == count)
                                            return false;
                                        if(x[count] >= (x[count - 2] - x[count - 4]))
                                            return true;
                                        else
                                            return typeone(x, count + 1);
                                    }
                                    else
                                        return typeone(x, count + 1);
                                }
                                else
                                    return false;
                            }
                        }
                        else
                            return false;
                    }
                }
                else
                    return false;
            }
        }
    }
}
