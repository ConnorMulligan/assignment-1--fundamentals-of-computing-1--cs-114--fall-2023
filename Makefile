filename = Assignment1

all: compile run

compile:
	javac $(filename).java

run:
	java $(filename)

clean:
	rm $(filename).class
