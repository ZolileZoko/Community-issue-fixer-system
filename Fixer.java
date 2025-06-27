class Fixer extends User {
    int rewardPoints;
    List<Issue> assignedIssues;
    
    void requestIssue(Issue issue);
    void submitFixReport(Issue issue);
    void claimReward();
}
