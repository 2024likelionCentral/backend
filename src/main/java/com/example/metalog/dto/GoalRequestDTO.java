package com.example.metalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoalRequestDTO{
    private String goal;
    private List<String> actions;
    private  boolean priority;
    private Long userId;
}

