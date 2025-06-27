class Admin extends User {
    void validateIssue(Issue issue);
    void addFixer(Fixer fixer);
    void updateRewardPoints(Fixer fixer, int points);
}