if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
      echo 'Checking Quality Gates'
      mvn -B clean verify sonar:sonar \
      -Dsonar.host.url=https://sonarcloud.io \
      -Dsonar.login=e18458dd7267847646de994362e0d612569ae279
      -Dsonar.projectKey=BAHHOU_MonitorMe \
      -Dsonar.organization=bahhou-github \
elif [ ${TRAVIS_PULL_REQUEST} != 'false' ]; then
      echo 'Build and analyze pull request'
      mvn -B clean verify sonar:sonar \
      -Dsonar.host.url=https://sonarcloud.io \
      -Dsonar.login=e18458dd7267847646de994362e0d612569ae279
      -Dsonar.projectKey=BAHHOU_MonitorMe \
      -Dsonar.organization=bahhou-github \
      -Dsonar.github.oauth=d9609c126cb444e6b8b512feee80be1d9602fcdb \
      -Dsonar.pullrequest.github.repository=BAHHOU/MonitorMe  \
      -Dsonar.pullrequest.provider=GitHub  \
      -Dsonar.pullrequest.branch=${TRAVIS_BRANCH}  \
      -Dsonar.pullrequest.key=${TRAVIS_PULL_REQUEST};
fi