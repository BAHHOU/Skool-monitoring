if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
      echo 'Checking Quality Gates'
      mvn -B clean verify sonar:sonar \
      -Dsonar.host.url=https://sonarcloud.io \
      -Dsonar.login=173a6f3663105a109acf1c78c43bf623de5a5377
      -Dsonar.projectKey=BAHHOU_MonitorMe \
      -Dsonar.organization=bahhou-github \
elif [ ${TRAVIS_PULL_REQUEST} != 'false' ]; then
    echo 'Build and analyze pull request'
fi