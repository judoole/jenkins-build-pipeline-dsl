def jobName = 'HelloWorld'

job(jobName) {
  steps{
    shell("echo Hello world")
  }
}
