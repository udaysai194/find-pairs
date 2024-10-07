package com.example.assignment.findPairs;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FindPairsController {

    private final FindPairsService findPairsService;

    public FindPairsController(FindPairsService findPairsService) {
        this.findPairsService = findPairsService;
    }

    @PostMapping("/find-pairs")
    public Pairs findPairs(@RequestBody FindPairsRequest request) {
        return findPairsService.findPairs(request.getNumbers(), request.getTarget());
    }
}
