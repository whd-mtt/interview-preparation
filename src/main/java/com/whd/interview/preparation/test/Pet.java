package com.whd.interview.preparation.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whd.java@gmail.com
 * @date 2019/5/10 10:54
 * @apiNote Describe the function of this class in one sentence
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    private String name;

    private Integer age;

    private String sex;
}
