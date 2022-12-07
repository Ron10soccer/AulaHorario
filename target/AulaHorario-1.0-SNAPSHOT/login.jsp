
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.98.0">
    <title>Signin Template · Bootstrap v5.2</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">

    

    

<link href="/docs/5.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

    <!-- Favicons -->

 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" rel="stylesheet">
    <!--bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    
    html,
    body {
    height: 100%;
    }

    body {
    display: flex;
    align-items: center;
    padding-top: 40px;
    padding-bottom: 40px;
    background-color: #f5f5f5;
    }

    .form-signin {
    max-width: 330px;
    padding: 15px;
    }

    .form-signin .form-floating:focus-within {
    z-index: 2;
    }

    .form-signin input[type="email"] {
    margin-bottom: -1px;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
    }

    .form-signin input[type="password"] {
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
    }
    </style>
   
  </head>
  <body class="text-center">
    
<main class="form-signin w-100 m-auto">
    <form action="Login" method="post">
    <img class="mb-4" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAkFBMVEUdHRv////l5eXk5OTm5ubj4+MAAADu7u74+Pj19fXx8fHr6+v7+/sbGxkSEg9iYmIMDAh9fXx3d3dOTk2cnJxsbGsmJiTAwMCsrKukpKQJCQRbW1otLSwXFxXd3d03NzbOzs6Hh4a9vb1HR0ZAQD+FhYSUlJTJyclTU1IqKim0tLR8fHxKSkqgoJ80NDO/v79zmUqEAAAQVElEQVR4nOVdC5ujqBIVNSigdiaTpPMY7U6mH5memez//3dXfCSigIWvuHvr22+zU9uT9ghUHQ5QWAgh33ZtP/10XNtLPzzbdSpeG+glSq/r2kzppTpvcPO6Xb2O9f+B0LGdDKFdPJ+96Oi17QLLzUsEr9P00twbFF53MK9TeC3f94nneST9TD9o+kHTz/+Q10pfQNYYTv7aF/aCN8bCwJu+LAbwZi9Y9AaLsjmd4rW3e10Tr5N6LVc6zEYektrBN8CQdCreidvQfkAbzma8jDYO//uxdLrB98h8uHDyYeYssudLPyFe1uYNCq/jODUvafNS0WsbeN2a10q/Mo8etUc18rKm97GwKt4ZZotg8GzRN7w0va3hZcqgY80xwA/qzSNNpzQPSv4VqnbvQk51oA6e/B3RO0W2YIzxD+omSfpSWZIsKP+jxyh8SPbNFiO1oc3SP/nsvD+tLi/bJb5b9OvlsjrtXhkKPOYO24Y172jjkFISsPN6c+WADssoDkPrbmEYR8sD/z8vq/2nFxAy3jgcI5Zyb7Jf/eKNFVtaC2PetNf3XdpjyXBUrRpLB8+HLqPk+T3GeBnqwVWMw/xx+mTUHWZICvnQGZiqocX+aITuhjLttJsv1I3TaJiOyEv7UjWPfaXwImN0pUUpyLOfdTcpAEdK1fTe4bJF6k1+94FXgow+WDokzQmco8kWA4SX9Fv/+YmXPeFlFmL89EzZUARuoDk+YesIt4RNA4vwdU/QjLQ2j31gbB5bdBZja81YZ6o2rNbG7BPGg8LLLMTxX3+IbNG/Dddj4CswnvtpbXZ/rY0E5+3A/VPE+PaKHqu1JZcB44vMYrwhHajaYFrbR+/0125LvEPsIVqb4yfbkQZgzfDPxOuhtRlFGqfqPY3cQe8W4T2PHiKBK2PKQpotBtDanOs0DZgbvqQTZRmBU1C13lqbS3aTNWBuET5TezqtjXpPUzZgZiF+J9on8xTeLjoNYtvD1AAt3lPTjgqkav20Nu954h5a2jJ89SbQ2hyyHpHE6C3GXx4yJXDG4xCtJh+CFcProO15ST+tzSXTxxgR4m8KoWrdtTb29liAKcQNHVFrs9nLIDpFP4hH34jAmUQaG10fD5BDpEaRprVr3r3udfyZBMTwhRgQOPj80GUv8wDIW9Hrq7UxiZfMYAyWhp+Qnqp10NocdHwEU1NZmjScgbU2unl0mhANr+mwWhv9mBfAFOIXgxE4mNaGznMDmEJMiJqqVbygWEoXDyPbaoutMlv019pcZj1muqS36CcZSmujx/nkiarhb7SD1lZ0TSHSrOc3CHPDnwgQadqzRfIYgFhu1R8Jsee2KnCt80MHWY+JMmup/RUiQvSHmmhtVarGbl5/NRGXEdsp3CK5RcL7xmtSo2oZCmaitX1O1EfxgtDciIM1CGu7PLDbW2vrsG+kG0J6A0ENEMZvfbW2b1OFGex1Qmjhnd9HayOvk8XRrghDzPpobcHbZGSmK0JruUE9tLbddKmwM0ILv/bQ2qYKM70Qxi/tWpuMqqVe7zQhm+mOMA02rN4175FGN7dwJ6VrPRCGFhO6pg3V2rzVlFOKjvkw/7trSRsKWhvzmEjVeAD2F5Mybpx4pSWmCMMouKOoEzi1TuN/m3ZWCOSl0uCH18xca5t2FDbMDGEYM3OtzXufUh8Na2aI0MJ75T5Gi5CC5JCc5JCCwNEpmzDc/hDsGhsiTH9cgiLDpoyl+0lTxU6EQbAhQi5omGptEYTOxAqpQWfS59uLMJgxwuiIDLU20MR3+XJmnqFJZyv9EaYzaFuptcnmFvQIWEmLviueQmdZiK60fTQQwsMJGc0tQNm+QkPMEMbH3b6wXfYqB0AYYiTJFrZSa4MsxERPHQAiGxfvu7CPgxlCZXzAz0qtjWVUjZUqFac+6Adg5rv8VvzSz+94CTbeZCCEO7kpA2A6E66h0GhtLki8KBGecVRP2BqzYAj5uRJwKC4akcG1NvYB4TMlwoPxNBmC0NzwlwvW2gikk5YIO0xBxkEYbTy11lZQNUJy6gMj3QXCDgx9HIQWzvlngYIQjdYGE6Dmh/CVQPPhBbRxZnYID+8+UGsLYN8/O4TxNWjR2oq5BQVuSxgSYWNuYfyd3LCLJDoNamQLcoLNfbsjDF82N3vjuSb+sxHsqdv+MvyFQFpb8B0m5XdHaIVRajnHiTMWEEeimX8lt8O7rA3vJCdgGYELoLP7Hgi5hQdxfnGzJo+BSmLxD5RSNca8Kg1t6jQwymb1Rci1+NKE3xh9PtcNrPrhhQvQ2hhUv+iJ8HpHWJ1uhxFqGFhRwc8MoLWBpW5DhOFtejEiwjWTaW0CySEEXYFrhmYIw+37t9x+L0dDuFwhQjMUhJYETlx7sk2W1MwQVhDh0RDywd2utYH5hCHCH+XzBuMhDA9Bi9bGhyR4e8kMEaaz4KbWdoulRfUt9vdfjfCcFSwqY6l0buG9Q5PPLBHuBIQ1rS1vQwrmhD0RVjL+cAgPp8aCt8VYobUxli0z+uANJv0QhtvkZjtcWXTqhXC54hqbz6uLpfyTE7igqdNsocJSv2whiGkp8Y4j/q9t2A9hdGzX2oDTX2OE4fW1sHqwrirLe9wPYdr3daeCsjaETz5NWdutxQTtVET4tyfCcCvX2iokh8LFwZ6zJ/482b8HRbikdxqaE7i61gaeO5kgFCaCKXcsrHiZQyJM50+oRWtz4TtmwQhxEviZIb7QNDLCBDW1NqFYmfs8AkK7fFQRYTIawqbWVomlYyB0TBAuUVAzBCaSfPMYsyVKlD0jhLJFJ4N9L5hXCNFrbRMilI5DOBj577q3oaC15SSHE7gHI+y9xwWzjKr5AaehGYGr6zTu1+QI40tS0p3klE9suoumuFVrGyWWKhDaxd+M6yNue+T21GWPuSRb1NtwjHzIqggrJ/0UHD9+y3+600JwgqRaG/WKD+qPwGnil8Lettmfa7xU8vPZF8PnABXDlNKChlKF1uaNwNri0mBf3ANhyhdatbbR5hZw64NwC9DawCcQ5oiQzw+VWluhRNGR5vhmj9kVYXShqK5E1RA6dCSdxsB6IFyuvAbCqbQ2A+uBUKW1FSQn09oIeH/3HBHiHS21tkCptYFPc80S4SdgX9tI6xYG1gcha9faxlp7MrDuCMODZF9bdraY8FPGBXMj46wfGlghHndAGL8EBYpMcsuwNfe1UcM1YGdwhNGxK8Jo47VqbbzWjtk6Phq8LAj+2xUhP/+EWrS2heMa7sVAr3gZD2gRLiZPXRA+u/J9beKuL8P9NGmE2vy5fM/tkv3T5z+/f/+LuiMkzYqYEoSGe6JGM3OEWYiC7Gv7Y7SvbUYIVfvaAlKQnILAEdA+9jkixF+ooGql1hY0tbaUwAXAgYhHRoiMi1Ph5FaGV1/tGvby4m0wMsJ/DBsxvgaAM6TZkITs8w7vCtpoZlgk7nCSFQGxCnZzIznpB4Fo67xWw+hmVugPP/sVFCUoyb42D7JKWt+ZPZK9mQjfmIFrKrSfmcG/JwGIyBJOCcszM61aWzokW889LbucrexkBmeOynNPTa3Nzbtm9YRly/fG1lQATQIqzhqOrzcLBZUUZ0i13XSKMHo3aEDllXhazpDmWltxhlTXTcFh1E90BoUIDKjKM6RVrS24EzjNt9aP8Kjtp/bYOjgagwJqiFGQU7UgaNHa8uSvVk3hZK3l5YO7Amm7RJHb4cTk15WoKg4oFTd4GF23nA4+gIczJKDihdte7VqoohTLaW8IDqOLp1WbgXtD+1mz6Kgqg2nVSU7xQRQlPasbX6czwDrzmUhQyLU2p6hPo/hS7Js+HmmYMcJWHT7cUoGqQeq1qerTZCfgTOy1GUWv7X9LtNb1sLI+jfwMqfwSTlWNoTA0nBYmTYR/DAG27oAJI6av13aviVwQuGyrneL8U/Rz7Jlv3dpXUniKrte+dAsCp6nXphreEb+zbzpj7eU3s/2MZvXaMoTKQ2whxm9PE9lxC9i3p6/XdqNqQa61BTcC52kSbf1U63gGUKPCmN6oWobCCyoETltXf8q6iT0MnzvfLBdMWPuyu2VH8uB3I4gEbtKCX10tq1+qqVgu0druf5ywBm1nW26CJlVr0druBC54bGlBiIXYcZtUDVa/NPNOVgu6q+FdWe4DVK9NQuBAlekeZ7yed8vdCK5A1RoEjpkuHkxsOHFlVM1127S2e4clU9XV72T4w9PejSDbuefWbhx92N0IEGvejVAirGttgai1CQQOvK7/AMvOHsioWsULuFnOm91NSKXhM1VQNcN7SOd+zwwgWygqlpfe2d4VREG3Ayq0NsELLOA2reXHRZWEs1VrE70MflZoMsskcxVVM7+HdLb3roHuIZVrbTUvfegluU1LU72OqtW1thRrU2uref153X/4rqdqMK2t5vXe5pMzcHZkUUPVGtmioGpaAjfje0ibVK2KUK211b0e+zEPiPjit1E1qNZW97J53Ad8aadqUK2t7nXdGdwnW9zpDL+1GnA7YGXNjb08OqLiJw9A1cBaW9MbHB+bF9M0YfS8bVpbNZY65e0zj4SIP2BUzUBr4xlf9JL1w65djfGXpx58XbW2ptd7xo+ZTEXhKwNeGa/R2gqqpvWS5Ncj4g3+Q5ukzJVSNddEayvojdBhXfY0+WAM8TttUdXMtLYWBY7uJu6pET7TNlWtq9YmektChBJrymbEF0YbzxCoqZqZ1uZIvS59n6wZI/xBPSOqZqi1Ke6y9pPtJM0Y4p+JB8gLPbQ2KYHLvB94/NnGEu90pGwYrU3pDZLjyF01xhvX7/BkYK2t3nBN7/N2RIoT4rck0C+ADqW16YbkWnc1Sj98fG9Sp8HXQWvTeJl9GgNjiKM1f8waKYNRNYXWBiVwpOElKcZh+2qM473w2wpS5iKVt0ngcq8mWzgQAld0C89dRwPGnAhf940SHiZUzUxra11CzbwsOP8El/jXWnjAT8+UAUnZMFqbB/IilHyr33NgbkuMP2xElKTMxKvV2uRUTep18lGeetOOfz72ARlhvPlEzBViikjK5N6htDYVgat60WKfguywIS4+pPC+hAxgd6ZqnbU2lZdVvDbzyPP71gglR3c9fTLPRXf6Zfegaj20NpCXEN9ffK22vOpsS4AN4yXf2v5+XgT+oM+g1draqZrGWzRn1mGT83pzzYoFLiPxhEoYxtGSX8NyeFmtn4v3nTecISkbQWtTeUnT6/IjAgE770+ry3Vb3a0f/Xq5rE67V5amUuZWvqHH4BtOayu9rOl1Gt7sd2apJKVUCb+ZmiVJkm0S4bVEUXmVlp6UmXg1WltJiESqVqNJpt4a0eLJqumV/yyEqgEIXFOJAlM1tbfosEzppaK3DykbWGuTeu06gauGDJC3DykbTWsz9PakX328U0Qa0RtovTdSBvC6IO+o2ULMAHIv1XkHyxadtbYWAucI9MsTM7OclA1E1QbT2v4NXgXzNqRqnqzhbGlz2tLmHJqqDau1dRiS2sE3wJAcWGuDhFV9AHUGp2qtWltPAgclZZMQOK0SZUTgJF1TS+DciQhcZ61tKAI3DlUbR2ubKYEbINI0qZpppDGhasYE7n/wW2FgZyAfWgAAAABJRU5ErkJggg==">
    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

    <div class="form-floating">
      <input type="text" name="usuario" class="form-control" id="floatingInput" placeholder="usuario">
      <label for="floatingInput">Usuario</label>
    </div>
    <div class="form-floating">
      <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017–2022</p>
  </form>
</main>


     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

  </body>
</html>
