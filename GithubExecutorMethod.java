class GithubExecutorMethod {
    public static void main(String[] args) {

        Repository repo = new Repository();
        repo.repoName = "AI-Project";
        repo.owner = "Keerthana";
        repo.language = "Java";
        repo.stars = 150;
        repo.forks = 30;
        repo.visibility = "Public";

        Github github = new Github();
        github.addRepository(repo);

        github.getRepository();
    }
}