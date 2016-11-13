def call(username, host, localpath, remotepath) {
    sh "scp -o StrictHostKeyChecking=no ${localpath} ${username}@${host}:${remotepath}"
}
