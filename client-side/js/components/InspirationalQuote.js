export default function InspirationalQuote(quote) {
    
    return `
    <div class='inspirational_quote__container'>
    <blockquote>&ldquo;${quote.text}&rdquo;  <footer>&mdash;${quote.author}</footer></blockquote>
    </div>
    `;

    // return `
    // <div class='inspirational_quote__container'>
    // ${quote.h}
    // </div>
    // `;

}

// ${InspirationalQuote(quote)}