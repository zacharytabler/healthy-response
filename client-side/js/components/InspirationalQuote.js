export default function InspirationalQuote(quote) {
    console.log(quote);
    return `
    <div class='inspirational_quote__container'>
    <blockquote>&ldquo;${quote.text}&rdquo; &mdash; <footer>${quote.author}</footer></blockquote>"
    </div>
    `;
}

// ${InspirationalQuote(quote)}