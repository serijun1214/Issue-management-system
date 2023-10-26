package com.example.issuemanagementsystem.web.issue;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class IssueForm {

    //概要
    @NotBlank
    @Size(max = 256)
    private String summary;
    //説明
    @NotBlank
    @Size(max = 256)
    private String description;
}
