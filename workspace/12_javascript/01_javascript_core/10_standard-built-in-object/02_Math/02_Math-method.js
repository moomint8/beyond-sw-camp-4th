/* 02. Math-method */

// Math.abs
console.log(Math.abs(-10));                     
console.log(Math.abs('-10'));                   
console.log(Math.abs(''));                     
console.log(Math.abs([]));                      
console.log(Math.abs(null));                    
console.log(Math.abs(undefined));               
console.log(Math.abs({}));                      
console.log(Math.abs('math'));                 
console.log(Math.abs());                       
console.log('--------------------');

// Math.round
console.log(Math.round(10.1));                  
console.log(Math.round(10.9));                  
console.log(Math.round(-10.1));                 
console.log(Math.round(-10.9));                 
console.log(Math.round(10));                    
console.log(Math.round());                      
console.log('--------------------');

// Math.ceil
console.log(Math.ceil(10.1));                 
console.log(Math.ceil(10.9));                 
console.log(Math.ceil(-10.1));                
console.log(Math.ceil(-10.9));                
console.log(Math.ceil(10));                   
console.log(Math.ceil());                     
console.log('--------------------');

// Math.floor
console.log(Math.floor(10.1));                
console.log(Math.floor(10.9));                
console.log(Math.floor(-10.1));               
console.log(Math.floor(-10.9));               
console.log(Math.floor(10));                  
console.log(Math.floor());                    
console.log('--------------------');

// Math.sqrt
console.log(Math.sqrt(4));                    
console.log(Math.sqrt(-4));                   
console.log(Math.sqrt(2));                    
console.log(Math.sqrt(1));                    
console.log(Math.sqrt(0));                    
console.log(Math.sqrt());                     
console.log('--------------------');

// Math.random
console.log(Math.random());               
// 1~100 범위의 난수 추출       
const random = Math.floor((Math.random() * 100) + 1);
console.log(random);
console.log('--------------------');

// Math.pow
console.log(Math.pow(2, 2));                 
console.log(Math.pow(2, -2));                
console.log(Math.pow(2));                    

/* ES7에서 도입 된 지수 연산자를 사용할 수 있다. */
console.log(2 ** 2);                         
console.log(2 ** -2);                        
console.log('--------------------');

// Math.max
console.log(Math.max(10));                   
console.log(Math.max(10, 20));               
console.log(Math.max(10, 20, 30));           
console.log(Math.max());                     
console.log('--------------------');          

// Math.min
console.log(Math.min(10));                   
console.log(Math.min(10, 20));               
console.log(Math.min(10, 20, 30));           
console.log(Math.min());                     
console.log('--------------------');      
