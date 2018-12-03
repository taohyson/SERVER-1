echo '重启构建项目'

svn up

#编译
mvn clean install -o
