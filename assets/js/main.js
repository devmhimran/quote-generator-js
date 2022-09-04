


const loadQuotes = ()=> {
    fetch('https://api.kanye.rest/')
    .then(res => res.json())
    .then(data => getQuoteData(data));
}


const getQuoteData = (quoteData) => { 
    const quoteBody = document.getElementById('quote-body');
    // const quoteText = document.getElementById('quote-text');
    const quoteText = document.getElementsByClassName('quote-text');
    for( const qText of quoteText ){
        qText.innerText = '';
    }

    
        const quoteElement = document.createElement('p');
        quoteElement.classList.add('quote-text');
        quoteElement.classList.add('text-center');
        quoteElement.innerText = quoteData.quote;
        quoteBody.appendChild(quoteElement);
        const i = 0;
        console(quoteData[i])
   

}

// function getQuoteData(data){
//     const quoteBody = document.getElementById('quote-body');
//     for( const quote of data ){
//         const quoteElement = document.createElement('p');
//         quoteElement.classList.add('quote-text');
//         quoteElement.innerText = quote;
//         quoteBody.appendChild(quoteElement);
//     }
// }
