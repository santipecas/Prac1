

JAVAC = javac
JAVADOC = javadoc
SRC = src
BIN = bin
DOCS = docs
CLASSES = $(shell find $(SRC) -name "*.java")

all: compile

compile:
	mkdir -p $(BIN)
	$(JAVAC) -d $(BIN) $(CLASSES)

javadoc:
	mkdir -p $(DOCS)
	$(JAVADOC) -d $(DOCS) $(CLASSES)

clean:
	rm -rf $(BIN) $(DOCS)

.PHONY: all compile javadoc clean
