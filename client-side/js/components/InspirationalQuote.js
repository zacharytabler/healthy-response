export default function InspirationalQuote(quote) {
    console.log('made it to InspirationalQuote.js')
    console.log(quote);
    return `
    <div class='inspirational_quote__container'>
    <blockquote>&ldquo;${quote.text}&rdquo;  <footer>&mdash;${quote.author}</footer></blockquote>
    </div>
    `;
}

// ${InspirationalQuote(quote)}