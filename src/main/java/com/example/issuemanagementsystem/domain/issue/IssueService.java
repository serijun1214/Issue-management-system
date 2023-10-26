package com.example.issuemanagementsystem.domain.issue;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;

    public List<IssueEntity> findAll() {
        return issueRepository.findAll();
    }

    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }
}
