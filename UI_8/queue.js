queue = function() {
    this.queue = [];
    this.enqueue = function(element) {
        this.queue.push(element);
    }
    this.dequeue = function() {
        this.queue.shift();
    }
}
Queue = new queue();
Queue.enqueue(12);
Queue.enqueue(122);
Queue.enqueue(192);

Queue.queue;
Queue.dequeue();
Queue.queue;