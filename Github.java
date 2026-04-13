class Github {
    int githubId;
    Repository repository;

    Github() {}

    Github(int githubId, Repository repository) {
        System.out.println("Constructor is started");
        this.githubId = githubId;
        this.repository = repository;
        System.out.println("Constructor is ended");
    }

    public boolean addRepository(Repository repository) {
        boolean isRepositorySaved = false;
        System.out.println("Add Repository Method started:");
        this.repository = repository;
        isRepositorySaved = true;
        System.out.println("Add Repository Method ended:");
        return isRepositorySaved;
    }

    public void getRepository() {
        System.out.println("Repository info:");
        System.out.println("Repo Name: " + repository.repoName);
        System.out.println("Owner: " + repository.owner);
        System.out.println("Language: " + repository.language);
        System.out.println("Stars: " + repository.stars);
        System.out.println("Forks: " + repository.forks);
        System.out.println("Visibility: " + repository.visibility);
    }
}