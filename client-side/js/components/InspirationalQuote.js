export default function InspirationalQuote(quote) {
    const author = (!quote.author) ? quote.author : "Author Unknown";
    return `
    <div class='inspirational_quote__container'>
    <blockquote>&ldquo;${quote.text}&rdquo;  
    <footer>&mdash;${author}</footer></blockquote>
    </div>
    `;
}