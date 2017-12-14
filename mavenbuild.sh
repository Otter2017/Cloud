basepath=$(pwd)

#mvn package

if [ ! -d $basepath/jars ]; then mkdir $basepath/jars ; fi

if [ -f $basepath/zuul/target/zuul.jar ]; then
  cp $basepath/zuul/target/zuul.jar $basepath/jars/zuul.jar;
fi

if [ -f $basepath/eurekaserver/target/EurekaServer.jar ]; then
  cp $basepath/eurekaserver/target/EurekaServer.jar $basepath/jars/eurekaserver.jar;
fi

if [ -f $basepath/configserver/target/configserver.jar ]; then
  cp $basepath/configserver/target/configserver.jar $basepath/jars/configserver.jar;
fi

if [ -f $basepath/configclient/target/configclient.jar ]; then
  cp $basepath/configclient/target/configclient.jar $basepath/jars/configclient.jar;
fi
