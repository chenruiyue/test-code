package com.example.testinterview;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //Declares a 2-D array used to store 10 1-D arrays
    final static char[][] map = new char[][]{
                                                {},
                                                {},
                                                {'a','b','c'},
                                                {'d','e','f'},
                                                {'g','h','i'},
                                                {'j','k','l'},
                                                {'m','n','o'},
                                                {'p','q','r','s'},
                                                {'t','u','v'},
                                                {'w','x','y','z'}};

    List<String> result;
    char[] chars;
    public void dfs(String tmp,int index){
        if(index==chars.length){
            result.add(tmp);
            return ;
        }
        else{
            for(int j=0;j<map[chars[index]].length;j++){
                dfs(tmp+map[chars[index]][j],index+1);
            }
        }
    }

    public String letterCombinations(int[] data) {
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<data.length;x++){
            sb.append(data[x]);
        }
        result=new ArrayList<String>();
        chars=sb.toString().toCharArray();
        StringBuilder rs = new StringBuilder();
        if(chars.length==0){
            return "";
        }
        for(int j=0;j<chars.length;j++){
            chars[j]-='0';
        }
        dfs("",0);
        for (int i = 0; i < result.size(); i++) {
            rs.append(result.get(i)).append(" ");
        }
        //Remove space before and after,return
        return rs.toString().trim();
    }


}
