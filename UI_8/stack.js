stack = function() {
    this.stack = [];
    this.push = function(element) {
        this.stack.push(element);
    }
    this.pop = function() {
        this.stack.pop();
    }
}
Stack = new stack();
Stack.push(12);
Stack.push(122);
Stack.push(192);

Stack.stack;
Stack.pop();
Stack.stack;