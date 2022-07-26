function solution(s) {
    const str = s.split(' ');
    const answer = [];    
    for (let i = 0; i < str.length; i++) {
        answer.push(str[i].split('').map((cur, j) => j%2 ? cur.toLowerCase() : cur.toUpperCase()).join(''));
    }
  return answer.join(" ");
}
console.log(solution("try hello world"));