class Stack {
    constructor() {
      this.arr = [];
      this.index = 0;
    }
    push(item) {
      this.arr[this.index++] = item;
    }
    pop() {
      if (this.index <= 0) return null;
      const result = this.arr[--this.index];
      return result;
    }
  }
  
  let stack = new Stack();
  stack.push(1); // arr: [0] >>> index: 1
  stack.push(2); // arr: [0 1] >>> index: 2
  stack.push(3); // arr: [0 1 2] >>> index: 3
  console.log(stack.pop()); // [0 1] >>> index: 2
  console.log(stack.pop()); // [0] >>> index: 1
  console.log(stack.pop()); // [] >>> index: 0
  console.log(stack.pop()); // null
  