stage('Review') {
    timeout(time:10,unit:'SECONDS'){
        input(message: 'Do you want to proceed?')
    }
    echo 'review step executed'
  }
node(){
  stage('Source') {
    echo 'Hello World'
  }
}