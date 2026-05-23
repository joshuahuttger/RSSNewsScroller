export SCROLLER_PROJECT_HOME="~/RSSNewsScroller"
export STORE_HOME="$SCROLLER_PROJECT_HOME/storystore"
alias spring='intellij-idea-community &'
alias scroll="cd $SCROLLER_PROJECT_HOME"
alias checkdocker="sudo systemctl status docker"
alias startdocker="sudo systemctl start docker"
alias stopdocker="sudo systemctl stop docker.socket docker.service"
alias dbstart="docker compose -f $STORE_HOME/mysql/compose.yaml up -d"
alias buildstore="cd $STORE_HOME && docker build --build-arg JAR_FILE=build/libs/\*.jar -t rssscroller/storystore ."
alias runstore="docker run -p 8080:8080 --network=mysql_default -e MYSQL_HOST=mysql rssscroller/storystore"

