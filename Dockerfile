FROM openjdk:11

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out src/main/java/ru/gb/jcore/sample/Main.java

CMD java -classpath ./out main.java.ru.gb.jcore.sample.Main