package com.example.testinterview;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestInterviewApplicationTests {

    @Test
    void contextLoads() {
        Solution solution = new Solution();
        //The numerical array，Here, change the value you want to enter
        int arr[] = {2,3};
        //calling method to get letters
        String result = solution.letterCombinations(arr);
        System.out.println(result);
    }

}
