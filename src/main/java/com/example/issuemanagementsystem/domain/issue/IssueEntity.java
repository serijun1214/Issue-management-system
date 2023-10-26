package com.example.issuemanagementsystem.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IssueEntity {
    //id
    private long id;
    //概要
    private String summary;
    //説明
    private String description;
}
