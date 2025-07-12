def call() {
    sh '''
        trivy fs . --exit-code 0 --format table > trivy-report.txt
        ls -l
    '''
}
