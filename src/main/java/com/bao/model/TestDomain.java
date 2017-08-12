package com.bao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by baochunyu on 2017/8/12.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestDomain {
    private String id;
    private String name;
    private Date date;

}
