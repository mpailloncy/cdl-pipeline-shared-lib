def call(username, host, command) {
    sh "ssh -o StrictHostKeyChecking=no -l ${username} ${host} -- ${command}"
}
