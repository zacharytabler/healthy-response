import SS1 from '../../images/top-slideShow-1.png'
import SS2 from '../../images/top-slideShow-2.png'
import SS3 from '../../images/top-slideShow-3.png'
import SS4 from '../../images/test-4.png'
import SS5 from '../../images/top-slideShow-4.png'
import SS6 from '../../images/top-slideShow-5.png'
import SS7 from '../../images/top-slideShow-6.png'
import SS8 from '../../images/top-slideShow-7.png'
import SS9 from '../../images/top-slideShow-8.png'
import SS10 from '../../images/test-5.png'
import SS11 from '../../images/top-slideShow-9.png'
import SS12 from '../../images/top-slideShow-10.png'

export default function BlogPage() {
    return `
    <div id="slideshow" class="slideshow" data-component="slideshow">
    <div role="list">
      <div class="slideShowGrid">
          <img class="SS1" src="${SS1}" alt=""/>
          <img class="SS2" src="${SS2}" alt=""/>
          <img class="SS3" src="${SS3}" alt=""/>
          </div>
          <div class="slideShowGrid">
          <img class="SS1" src="${SS7}" alt=""/>
          <img class="SS2" src="${SS8}" alt=""/>
          <img class="SS3" src="${SS9}" alt=""/>
          </div>
          </div>
          </div>
          <div id="slideshow" class="slideshow" data-component="slideshow">
          <div role="list">
            <div class="slideShowGrid">
                <img class="SS1" src="${SS4}" alt=""/>
                <img class="SS2" src="${SS5}" alt=""/>
                <img class="SS3" src="${SS6}" alt=""/>
                </div>
                <div class="slideShowGrid">
                <img class="SS1" src="${SS10}" alt=""/>
                <img class="SS2" src="${SS11}" alt=""/>
                <img class="SS3" src="${SS12}" alt=""/>
                </div>
                </div>
                </div>


    `;
}