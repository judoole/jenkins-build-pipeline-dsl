def jobName = 'anotherjob'

job(jobName) {
  steps {
      shell('hello world')
  }
}
