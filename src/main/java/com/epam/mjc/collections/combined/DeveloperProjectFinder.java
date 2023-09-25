package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            Set<String> projectDevelopers = entry.getValue();
            if (projectDevelopers.contains(developer)) {
                developerProjects.add(projectName);
            }
        }

        Collections.sort(developerProjects, (a, b) -> {
            int lengthComparison = Integer.compare(b.length(), a.length());
            if (lengthComparison == 0) {
                return b.compareTo(a);
            }

            return lengthComparison;
        });

        return developerProjects;
    }
}
